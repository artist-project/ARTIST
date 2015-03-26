/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.VirtualDirectory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl#getVirtualDirectory <em>Virtual Directory</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl#getVirtualApplication <em>Virtual Application</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.VirtualDirectoryImpl#getPhysicalDirectory <em>Physical Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualDirectoryImpl extends MinimalEObjectImpl.Container implements VirtualDirectory {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getPhysicalDirectory() <em>Physical Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalDirectory() <em>Physical Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDirectory()
	 * @generated
	 * @ordered
	 */
	protected String physicalDirectory = PHYSICAL_DIRECTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.VIRTUAL_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualDirectory> getVirtualDirectory() {
		return getGroup().list(AzureCSDefPackage.Literals.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualDirectory> getVirtualApplication() {
		return getGroup().list(AzureCSDefPackage.Literals.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.VIRTUAL_DIRECTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalDirectory() {
		return physicalDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalDirectory(String newPhysicalDirectory) {
		String oldPhysicalDirectory = physicalDirectory;
		physicalDirectory = newPhysicalDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY, oldPhysicalDirectory, physicalDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY:
				return ((InternalEList<?>)getVirtualDirectory()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION:
				return ((InternalEList<?>)getVirtualApplication()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY:
				return getVirtualDirectory();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION:
				return getVirtualApplication();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__NAME:
				return getName();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY:
				return getPhysicalDirectory();
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
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY:
				getVirtualDirectory().clear();
				getVirtualDirectory().addAll((Collection<? extends VirtualDirectory>)newValue);
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION:
				getVirtualApplication().clear();
				getVirtualApplication().addAll((Collection<? extends VirtualDirectory>)newValue);
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY:
				setPhysicalDirectory((String)newValue);
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
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP:
				getGroup().clear();
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY:
				getVirtualDirectory().clear();
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION:
				getVirtualApplication().clear();
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY:
				setPhysicalDirectory(PHYSICAL_DIRECTORY_EDEFAULT);
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
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__GROUP:
				return group != null && !group.isEmpty();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_DIRECTORY:
				return !getVirtualDirectory().isEmpty();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__VIRTUAL_APPLICATION:
				return !getVirtualApplication().isEmpty();
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.VIRTUAL_DIRECTORY__PHYSICAL_DIRECTORY:
				return PHYSICAL_DIRECTORY_EDEFAULT == null ? physicalDirectory != null : !PHYSICAL_DIRECTORY_EDEFAULT.equals(physicalDirectory);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", physicalDirectory: ");
		result.append(physicalDirectory);
		result.append(')');
		return result.toString();
	}

} //VirtualDirectoryImpl
