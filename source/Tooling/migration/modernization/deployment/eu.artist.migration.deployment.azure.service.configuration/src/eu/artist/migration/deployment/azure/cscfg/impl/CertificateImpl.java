/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.Certificate;
import eu.artist.migration.deployment.azure.cscfg.ThumbprintAlgorithmTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl#getThumbprint <em>Thumbprint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.CertificateImpl#getThumbprintAlgorithm <em>Thumbprint Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CertificateImpl extends MinimalEObjectImpl.Container implements Certificate {
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
	 * The default value of the '{@link #getThumbprint() <em>Thumbprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprint()
	 * @generated
	 * @ordered
	 */
	protected static final String THUMBPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThumbprint() <em>Thumbprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprint()
	 * @generated
	 * @ordered
	 */
	protected String thumbprint = THUMBPRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThumbprintAlgorithm() <em>Thumbprint Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprintAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final ThumbprintAlgorithmTypes THUMBPRINT_ALGORITHM_EDEFAULT = ThumbprintAlgorithmTypes.SHA1;

	/**
	 * The cached value of the '{@link #getThumbprintAlgorithm() <em>Thumbprint Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprintAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected ThumbprintAlgorithmTypes thumbprintAlgorithm = THUMBPRINT_ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Thumbprint Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thumbprintAlgorithmESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.CERTIFICATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.CERTIFICATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThumbprint() {
		return thumbprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbprint(String newThumbprint) {
		String oldThumbprint = thumbprint;
		thumbprint = newThumbprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.CERTIFICATE__THUMBPRINT, oldThumbprint, thumbprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThumbprintAlgorithmTypes getThumbprintAlgorithm() {
		return thumbprintAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbprintAlgorithm(ThumbprintAlgorithmTypes newThumbprintAlgorithm) {
		ThumbprintAlgorithmTypes oldThumbprintAlgorithm = thumbprintAlgorithm;
		thumbprintAlgorithm = newThumbprintAlgorithm == null ? THUMBPRINT_ALGORITHM_EDEFAULT : newThumbprintAlgorithm;
		boolean oldThumbprintAlgorithmESet = thumbprintAlgorithmESet;
		thumbprintAlgorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM, oldThumbprintAlgorithm, thumbprintAlgorithm, !oldThumbprintAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThumbprintAlgorithm() {
		ThumbprintAlgorithmTypes oldThumbprintAlgorithm = thumbprintAlgorithm;
		boolean oldThumbprintAlgorithmESet = thumbprintAlgorithmESet;
		thumbprintAlgorithm = THUMBPRINT_ALGORITHM_EDEFAULT;
		thumbprintAlgorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM, oldThumbprintAlgorithm, THUMBPRINT_ALGORITHM_EDEFAULT, oldThumbprintAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThumbprintAlgorithm() {
		return thumbprintAlgorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSCfgPackage.CERTIFICATE__NAME:
				return getName();
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT:
				return getThumbprint();
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM:
				return getThumbprintAlgorithm();
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
			case AzureCSCfgPackage.CERTIFICATE__NAME:
				setName((String)newValue);
				return;
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT:
				setThumbprint((String)newValue);
				return;
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM:
				setThumbprintAlgorithm((ThumbprintAlgorithmTypes)newValue);
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
			case AzureCSCfgPackage.CERTIFICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT:
				setThumbprint(THUMBPRINT_EDEFAULT);
				return;
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM:
				unsetThumbprintAlgorithm();
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
			case AzureCSCfgPackage.CERTIFICATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT:
				return THUMBPRINT_EDEFAULT == null ? thumbprint != null : !THUMBPRINT_EDEFAULT.equals(thumbprint);
			case AzureCSCfgPackage.CERTIFICATE__THUMBPRINT_ALGORITHM:
				return isSetThumbprintAlgorithm();
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
		result.append(", thumbprint: ");
		result.append(thumbprint);
		result.append(", thumbprintAlgorithm: ");
		if (thumbprintAlgorithmESet) result.append(thumbprintAlgorithm); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CertificateImpl
