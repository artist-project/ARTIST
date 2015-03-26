/**
 */
package gaeweb.impl;

import gaeweb.EnvVarType;
import gaeweb.EnvVariablesType;
import gaeweb.GaewebPackage;

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
 * An implementation of the model object '<em><b>Env Variables Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.EnvVariablesTypeImpl#getEnvVar <em>Env Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvVariablesTypeImpl extends MinimalEObjectImpl.Container implements EnvVariablesType {
	/**
	 * The cached value of the '{@link #getEnvVar() <em>Env Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVar()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvVarType> envVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvVariablesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.ENV_VARIABLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvVarType> getEnvVar() {
		if (envVar == null) {
			envVar = new EObjectContainmentEList<EnvVarType>(EnvVarType.class, this, GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR);
		}
		return envVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR:
				return ((InternalEList<?>)getEnvVar()).basicRemove(otherEnd, msgs);
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
			case GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR:
				return getEnvVar();
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
			case GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR:
				getEnvVar().clear();
				getEnvVar().addAll((Collection<? extends EnvVarType>)newValue);
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
			case GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR:
				getEnvVar().clear();
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
			case GaewebPackage.ENV_VARIABLES_TYPE__ENV_VAR:
				return envVar != null && !envVar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvVariablesTypeImpl
