/**
 */
package gaeweb.impl;

import gaeweb.ClassLoaderConfigType;
import gaeweb.GaewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Loader Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.ClassLoaderConfigTypeImpl#getPrioritySpecifier <em>Priority Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassLoaderConfigTypeImpl extends MinimalEObjectImpl.Container implements ClassLoaderConfigType {
	/**
	 * The cached value of the '{@link #getPrioritySpecifier() <em>Priority Specifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritySpecifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> prioritySpecifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassLoaderConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.CLASS_LOADER_CONFIG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getPrioritySpecifier() {
		if (prioritySpecifier == null) {
			prioritySpecifier = new EDataTypeEList<Object>(Object.class, this, GaewebPackage.CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER);
		}
		return prioritySpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER:
				return getPrioritySpecifier();
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
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER:
				getPrioritySpecifier().clear();
				getPrioritySpecifier().addAll((Collection<? extends Object>)newValue);
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
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER:
				getPrioritySpecifier().clear();
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
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER:
				return prioritySpecifier != null && !prioritySpecifier.isEmpty();
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
		result.append(" (prioritySpecifier: ");
		result.append(prioritySpecifier);
		result.append(')');
		return result.toString();
	}

} //ClassLoaderConfigTypeImpl
