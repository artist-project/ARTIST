/**
 */
package deployment_provider.impl;

import deployment_provider.DeploymentDescriptor;
import deployment_provider.DeploymentRecipe;
import deployment_provider.DeploymentTemplate;
import deployment_provider.Deployment_providerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.DeploymentDescriptorImpl#getReliesOnRecipe <em>Relies On Recipe</em>}</li>
 *   <li>{@link deployment_provider.impl.DeploymentDescriptorImpl#getReliesOnTemplate <em>Relies On Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentDescriptorImpl extends ServiceConfigurationDescriptorImpl implements DeploymentDescriptor {
	/**
	 * The cached value of the '{@link #getReliesOnRecipe() <em>Relies On Recipe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliesOnRecipe()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentRecipe> reliesOnRecipe;

	/**
	 * The cached value of the '{@link #getReliesOnTemplate() <em>Relies On Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliesOnTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentTemplate> reliesOnTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.DEPLOYMENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentRecipe> getReliesOnRecipe() {
		if (reliesOnRecipe == null) {
			reliesOnRecipe = new EObjectContainmentEList<DeploymentRecipe>(DeploymentRecipe.class, this, Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE);
		}
		return reliesOnRecipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentTemplate> getReliesOnTemplate() {
		if (reliesOnTemplate == null) {
			reliesOnTemplate = new EObjectContainmentEList<DeploymentTemplate>(DeploymentTemplate.class, this, Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE);
		}
		return reliesOnTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE:
				return ((InternalEList<?>)getReliesOnRecipe()).basicRemove(otherEnd, msgs);
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE:
				return ((InternalEList<?>)getReliesOnTemplate()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE:
				return getReliesOnRecipe();
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE:
				return getReliesOnTemplate();
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
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE:
				getReliesOnRecipe().clear();
				getReliesOnRecipe().addAll((Collection<? extends DeploymentRecipe>)newValue);
				return;
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE:
				getReliesOnTemplate().clear();
				getReliesOnTemplate().addAll((Collection<? extends DeploymentTemplate>)newValue);
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
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE:
				getReliesOnRecipe().clear();
				return;
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE:
				getReliesOnTemplate().clear();
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
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_RECIPE:
				return reliesOnRecipe != null && !reliesOnRecipe.isEmpty();
			case Deployment_providerPackage.DEPLOYMENT_DESCRIPTOR__RELIES_ON_TEMPLATE:
				return reliesOnTemplate != null && !reliesOnTemplate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentDescriptorImpl
