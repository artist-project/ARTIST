/**
 */
package gaeweb.impl;

import gaeweb.ExcludeType;
import gaeweb.GaewebPackage;
import gaeweb.IncludeType;
import gaeweb.ResourceFilesType;

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
 * An implementation of the model object '<em><b>Resource Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.ResourceFilesTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link gaeweb.impl.ResourceFilesTypeImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceFilesTypeImpl extends MinimalEObjectImpl.Container implements ResourceFilesType {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeType> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcludeType> exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.RESOURCE_FILES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<IncludeType>(IncludeType.class, this, GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExcludeType> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<ExcludeType>(ExcludeType.class, this, GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
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
			case GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE:
				return getInclude();
			case GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE:
				return getExclude();
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
			case GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends ExcludeType>)newValue);
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
			case GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE:
				getExclude().clear();
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
			case GaewebPackage.RESOURCE_FILES_TYPE__INCLUDE:
				return include != null && !include.isEmpty();
			case GaewebPackage.RESOURCE_FILES_TYPE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceFilesTypeImpl
