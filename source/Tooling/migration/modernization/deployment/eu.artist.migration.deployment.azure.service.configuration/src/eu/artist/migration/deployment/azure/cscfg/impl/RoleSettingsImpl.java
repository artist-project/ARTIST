/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.CertificatesType;
import eu.artist.migration.deployment.azure.cscfg.ConfigurationSettingsType;
import eu.artist.migration.deployment.azure.cscfg.OsImageSetting;
import eu.artist.migration.deployment.azure.cscfg.RoleSettings;
import eu.artist.migration.deployment.azure.cscfg.TargetSetting;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getOsImage <em>Os Image</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.RoleSettingsImpl#getVmName <em>Vm Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleSettingsImpl extends MinimalEObjectImpl.Container implements RoleSettings {
	/**
	 * The cached value of the '{@link #getOsImage() <em>Os Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsImage()
	 * @generated
	 * @ordered
	 */
	protected OsImageSetting osImage;

	/**
	 * The cached value of the '{@link #getConfigurationSettings() <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSettings()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationSettingsType configurationSettings;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected TargetSetting instances;

	/**
	 * The cached value of the '{@link #getCertificates() <em>Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificates()
	 * @generated
	 * @ordered
	 */
	protected CertificatesType certificates;

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
	 * The default value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmName()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmName()
	 * @generated
	 * @ordered
	 */
	protected String vmName = VM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.ROLE_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsImageSetting getOsImage() {
		return osImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsImage(OsImageSetting newOsImage, NotificationChain msgs) {
		OsImageSetting oldOsImage = osImage;
		osImage = newOsImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE, oldOsImage, newOsImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsImage(OsImageSetting newOsImage) {
		if (newOsImage != osImage) {
			NotificationChain msgs = null;
			if (osImage != null)
				msgs = ((InternalEObject)osImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE, null, msgs);
			if (newOsImage != null)
				msgs = ((InternalEObject)newOsImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE, null, msgs);
			msgs = basicSetOsImage(newOsImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE, newOsImage, newOsImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSettingsType getConfigurationSettings() {
		return configurationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationSettings(ConfigurationSettingsType newConfigurationSettings, NotificationChain msgs) {
		ConfigurationSettingsType oldConfigurationSettings = configurationSettings;
		configurationSettings = newConfigurationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS, oldConfigurationSettings, newConfigurationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationSettings(ConfigurationSettingsType newConfigurationSettings) {
		if (newConfigurationSettings != configurationSettings) {
			NotificationChain msgs = null;
			if (configurationSettings != null)
				msgs = ((InternalEObject)configurationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS, null, msgs);
			if (newConfigurationSettings != null)
				msgs = ((InternalEObject)newConfigurationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS, null, msgs);
			msgs = basicSetConfigurationSettings(newConfigurationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS, newConfigurationSettings, newConfigurationSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSetting getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(TargetSetting newInstances, NotificationChain msgs) {
		TargetSetting oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(TargetSetting newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES, newInstances, newInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificatesType getCertificates() {
		return certificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificates(CertificatesType newCertificates, NotificationChain msgs) {
		CertificatesType oldCertificates = certificates;
		certificates = newCertificates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES, oldCertificates, newCertificates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificates(CertificatesType newCertificates) {
		if (newCertificates != certificates) {
			NotificationChain msgs = null;
			if (certificates != null)
				msgs = ((InternalEObject)certificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES, null, msgs);
			if (newCertificates != null)
				msgs = ((InternalEObject)newCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES, null, msgs);
			msgs = basicSetCertificates(newCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES, newCertificates, newCertificates));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmName() {
		return vmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmName(String newVmName) {
		String oldVmName = vmName;
		vmName = newVmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ROLE_SETTINGS__VM_NAME, oldVmName, vmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE:
				return basicSetOsImage(null, msgs);
			case AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS:
				return basicSetConfigurationSettings(null, msgs);
			case AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES:
				return basicSetInstances(null, msgs);
			case AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES:
				return basicSetCertificates(null, msgs);
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
			case AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE:
				return getOsImage();
			case AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS:
				return getConfigurationSettings();
			case AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES:
				return getInstances();
			case AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES:
				return getCertificates();
			case AzureCSCfgPackage.ROLE_SETTINGS__NAME:
				return getName();
			case AzureCSCfgPackage.ROLE_SETTINGS__VM_NAME:
				return getVmName();
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
			case AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE:
				setOsImage((OsImageSetting)newValue);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettingsType)newValue);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES:
				setInstances((TargetSetting)newValue);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES:
				setCertificates((CertificatesType)newValue);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__NAME:
				setName((String)newValue);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__VM_NAME:
				setVmName((String)newValue);
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
			case AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE:
				setOsImage((OsImageSetting)null);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettingsType)null);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES:
				setInstances((TargetSetting)null);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES:
				setCertificates((CertificatesType)null);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSCfgPackage.ROLE_SETTINGS__VM_NAME:
				setVmName(VM_NAME_EDEFAULT);
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
			case AzureCSCfgPackage.ROLE_SETTINGS__OS_IMAGE:
				return osImage != null;
			case AzureCSCfgPackage.ROLE_SETTINGS__CONFIGURATION_SETTINGS:
				return configurationSettings != null;
			case AzureCSCfgPackage.ROLE_SETTINGS__INSTANCES:
				return instances != null;
			case AzureCSCfgPackage.ROLE_SETTINGS__CERTIFICATES:
				return certificates != null;
			case AzureCSCfgPackage.ROLE_SETTINGS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSCfgPackage.ROLE_SETTINGS__VM_NAME:
				return VM_NAME_EDEFAULT == null ? vmName != null : !VM_NAME_EDEFAULT.equals(vmName);
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
		result.append(", vmName: ");
		result.append(vmName);
		result.append(')');
		return result.toString();
	}

} //RoleSettingsImpl
