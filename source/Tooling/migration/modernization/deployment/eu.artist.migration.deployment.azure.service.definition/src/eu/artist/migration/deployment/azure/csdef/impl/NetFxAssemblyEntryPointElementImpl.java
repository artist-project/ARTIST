/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Fx Assembly Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.NetFxAssemblyEntryPointElementImpl#getTargetFrameworkVersion <em>Target Framework Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetFxAssemblyEntryPointElementImpl extends MinimalEObjectImpl.Container implements NetFxAssemblyEntryPointElement {
	/**
	 * The default value of the '{@link #getAssemblyName() <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssemblyName() <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyName()
	 * @generated
	 * @ordered
	 */
	protected String assemblyName = ASSEMBLY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFrameworkVersion() <em>Target Framework Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameworkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FRAMEWORK_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrameworkVersion() <em>Target Framework Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameworkVersion()
	 * @generated
	 * @ordered
	 */
	protected String targetFrameworkVersion = TARGET_FRAMEWORK_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetFxAssemblyEntryPointElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssemblyName() {
		return assemblyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyName(String newAssemblyName) {
		String oldAssemblyName = assemblyName;
		assemblyName = newAssemblyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME, oldAssemblyName, assemblyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFrameworkVersion() {
		return targetFrameworkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrameworkVersion(String newTargetFrameworkVersion) {
		String oldTargetFrameworkVersion = targetFrameworkVersion;
		targetFrameworkVersion = newTargetFrameworkVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION, oldTargetFrameworkVersion, targetFrameworkVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME:
				return getAssemblyName();
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION:
				return getTargetFrameworkVersion();
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
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME:
				setAssemblyName((String)newValue);
				return;
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION:
				setTargetFrameworkVersion((String)newValue);
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
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME:
				setAssemblyName(ASSEMBLY_NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION:
				setTargetFrameworkVersion(TARGET_FRAMEWORK_VERSION_EDEFAULT);
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
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__ASSEMBLY_NAME:
				return ASSEMBLY_NAME_EDEFAULT == null ? assemblyName != null : !ASSEMBLY_NAME_EDEFAULT.equals(assemblyName);
			case AzureCSDefPackage.NET_FX_ASSEMBLY_ENTRY_POINT_ELEMENT__TARGET_FRAMEWORK_VERSION:
				return TARGET_FRAMEWORK_VERSION_EDEFAULT == null ? targetFrameworkVersion != null : !TARGET_FRAMEWORK_VERSION_EDEFAULT.equals(targetFrameworkVersion);
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
		result.append(" (assemblyName: ");
		result.append(assemblyName);
		result.append(", targetFrameworkVersion: ");
		result.append(targetFrameworkVersion);
		result.append(')');
		return result.toString();
	}

} //NetFxAssemblyEntryPointElementImpl
